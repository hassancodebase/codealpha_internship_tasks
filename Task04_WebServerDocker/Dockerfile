# Step 1: Use official Nginx image as base
FROM nginx:alpine

# Step 2: Set who made this
LABEL maintainer="Muhammad Hassan"
LABEL description="Web Server using Docker"
LABEL version="1.0"

# Step 3: Copy our webpage into the container
COPY index.html /usr/share/nginx/html/index.html

# Step 4: Copy our Nginx config into the container
COPY nginx.conf /etc/nginx/conf.d/default.conf

# Step 5: Open port 80 so we can access the web server
EXPOSE 80

# Step 6: Start Nginx when container runs
CMD ["nginx", "-g", "daemon off;"]