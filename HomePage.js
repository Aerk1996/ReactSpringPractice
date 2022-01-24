import React, { useEffect, useState } from 'react'

const HomePage = () => {
const[user,setUser] =useState("");

    useEffect(()=>{
        fetch('http://localhost:8080/api/users')
        .then(res=>res.json())
        .then(data => setUser(data))
    },[])



    return (
            <div>
                <h2>This is home page</h2>
                <h3>{user.map(erkin=>{
                    return(
                        <div>
                            <p>{erkin.firstName}</p>
                            <p>{erkin.lastName}</p>
                            <p>{erkin.email}</p>
                        </div>
                    )
                })}</h3>
            </div>
    );
}

export default HomePage