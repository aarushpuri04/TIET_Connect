# Tiet Connect

<p>Tiet Connect is a social media platform designed for connecting users through posts, comments, and messaging. It provides features such as user authentication, profile management, posting updates, and more. The platform is built using React for the frontend and Node.js with Express for the backend, and it integrates with MongoDB for data storage.</p>

## Features

- User Authentication (Login and Registration)
- Profile Management
- Posting and Commenting
- File Upload (Profile pictures and Post images)
- Theming (Light and Dark Modes)
- Responsive Design
- Automated Testing with Selenium

## Installation

To get a local copy of the project up and running, follow these steps:

### Prerequisites

- Node.js and npm installed on your machine
- MongoDB installed and running locally or a cloud-based MongoDB service
- Chrome browser, Eclipse IDE with selenium and TestNG framework for testing

### Backend Setup

1. Clone the repository and install dependencies:
   ```bash
   git clone https://github.com/yourusername/tiet-connect.git
   cd tiet-connect/backend
   npm install
   ```
2. Set up environment variables in server and start npm start:
   ```bash
   PORT=3001
   MONGO_URL=your_mongodb_connection_string
   JWT_SECRET = ""  add any key or string
   ```

### Frontend Setup

1. Navigate to the frontend directory and do npm install:

   ```bash
   cd ../frontend
   npm install
   npm start

   The frontend server will start on http://localhost:3000.
   ```

# Running Tests

## Automated Testing with Selenium

<p>The project includes automated tests using Selenium WebDriver. To run these tests, open your eclipse ide and eun the script after installing all java, selenium and test ng dependencies or make sure you have the ChromeDriver executable available and update its path in the test configuration if necessary </p>

# Author

Aarush Puri and Paras Gupta
