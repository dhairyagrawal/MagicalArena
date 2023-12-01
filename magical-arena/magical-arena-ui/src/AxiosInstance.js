import axios from 'axios';

const baseURL = 'http://localhost:8080/'; // Replace with your actual backend API URL

const axiosInstance = axios.create({
  baseURL,
  // You can add other custom configurations here
});

export default axiosInstance;