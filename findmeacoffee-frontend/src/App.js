import logo from './logo.svg';
import './App.css';
import {useEffect, useState} from "react";

function App() {
  const [message, setMessage] = useState('');

    useEffect(() => {
        fetch("http://localhost:8080/hello")
            .then(response => response.json())
            .then(data => setMessage(data.message))
            .catch(error => console.error('Error:', error));
    }, []);

    return (
      <div>
          <h1>FindMeACoffee</h1>
          <p>{message}</p>
      </div>
    );
}

export default App;
