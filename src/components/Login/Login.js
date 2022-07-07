import React,{useState} from 'react';
import {Link} from 'react-router-dom';
import { useNavigate } from "react-router-dom";
import logo from './logo.png';
// import { ReactDOM } from 'react';
import "./Login.css"
export default function Login(props) {
    const navigate = useNavigate();
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    
    const signIn = e => {
        e.preventDefault();
    }
    
    const register = e => {
        e.preventDefault();
    }

  return (
    <div className='login'>
        <Link to='/'>
         <img className='login-logo' src={logo}/>
        </Link> 
        <div className='login__container'>
                <h1>Sign-in</h1>

                <form>
                    <h5>E-mail</h5>
                    <input type='text' value={email} onChange={e => setEmail(e.target.value)} />

                    <h5>Password</h5>
                    <input type='password' value={password} onChange={e => setPassword(e.target.value)} />

                    <button type="submit" onClick={signIn}  className='login__signInButton'>Sign In</button>
                </form>

                <p>
                    By signing-in you agree to the OLA FAKE CLONE Conditions of Use & Sale. Please
                    see our Privacy Notice, our Cookies Notice and our Interest-Based Ads Notice.
                </p>
                {/* <Link  to="/SignUp" />Home</Link> */}
     
               <button onClick={() => navigate("/SignUp")} className='login__registerButton'>Create your OLA Account</button>
           </div> 
    </div>
  );
}

 