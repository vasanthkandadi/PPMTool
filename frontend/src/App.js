import React from "react";
import './App.css';
import Dashboard from "./components/Dashboard";
import Header from "./components/Layout/Header";
import { BrowserRouter as Router, Route, Routes} from "react-router-dom";
import AddProject from "./components/Project/AddProject";

function App() {
  return (
    <Router>
      <div className="App">
        <Header/>
        <Routes>
          <Route path="/dashboard" element = {<Dashboard/>}/>
          <Route path = "/addProject" element = {<AddProject/>}/>
        </Routes>
      </div>
    </Router>
  );
}

export default App;
