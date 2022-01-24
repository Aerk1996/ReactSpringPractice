
import React,{useState,useEffect} from 'react';
import {BrowserRouter,Routes,Route,Outlet,Link} from 'react-router-dom'
import './App.css';
import HomePage from './components/HomePage';
import Signup from './components/Signup';



function App() {
 

  return (
        <div>
         <BrowserRouter>
         <Routes>

        <Route path="/" element={<Signup/>}/>
         
        
         <Route path="/home" element={<HomePage/>}/>
          
         
         </Routes>
         </BrowserRouter>
        </div>
  );
}

export default App;
