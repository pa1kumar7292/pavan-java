# Use OpenJDK 21 as the base image
FROM openjdk:21

# Set the working directory
WORKDIR /usr/app

# Copy the built jar into the container
COPY target/demo-0.0.1-SNAPSHOT.jar /usr/app/demo-0.0.1-SNAPSHOT.jar

# Expose port 8081 for the application
EXPOSE 8081

# Copy run script
COPY run.sh /usr/app

# Update packages and install nginx
RUN microdnf update -y && microdnf install nginx -y

# Remove default nginx configuration
RUN rm -rf /etc/nginx/sites-enabled/default

# Copy custom nginx configuration and SSL files
COPY nginx_ssl.conf /etc/nginx/conf.d/
COPY koinbasket.crt /etc/ssl/certs/
RUN mkdir -p /etc/ssl/private
COPY koinbasket.key /etc/ssl/private/

# Make the run.sh script executable
RUN chmod +x /usr/app/run.sh

# Set the entry point to run the application
ENTRYPOINT ["/usr/app/run.sh"]
