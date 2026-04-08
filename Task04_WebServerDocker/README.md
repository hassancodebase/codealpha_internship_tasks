# Task 4 — Web Server using Docker

## Overview

A web server deployed inside a Docker container using Nginx.

## Technologies Used

- Docker
- Nginx
- HTML/CSS

## How to Run

### Build the image

```bash
docker build -t codealpha-webserver .
```

### Run the container

```bash
docker run -d -p 8080:80 --name my-webserver codealpha-webserver
```

### Open in browser

Go to: http://localhost:8080  

### Check container health

Go to: http://localhost:8080/health  

### Stop the container

```bash
docker stop my-webserver
```

## Intern

**Muhammad Hassan**  
