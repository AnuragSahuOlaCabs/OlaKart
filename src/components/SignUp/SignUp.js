import React,{useState} from 'react';
import {Link} from 'react-router-dom';
import logo from './logo.png';

// import { ReactDOM } from 'react';
import "./SignUp.css"
export default function SignUp(props) {
    
    const [name, setName] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [phone, setPhone] = useState('');
    const [gender, setGender] = useState('');
    const [address, setAddress] = useState('');

    
    const register = e => {
        e.preventDefault();

    }
    
      const handleSubmit = (event) => {
      event.preventDefault()
      console.log(event.target[0].value)
      // console.log(event.target.elements.name.value)
      // console.log(event.target.phone.value)
  
    }
  return (
    <div className='login'>
        <Link to='/SignUp'>
         <img className='login-logo' src={logo}/>
        </Link> 
        <div className='signup__container'>
                <h1>Sign-up</h1>

                <form onSubmit={handleSubmit}>
                    <h5>Name</h5>
                    <input type='text' value={name} onChange={e => setName(e.target.value)} />

                    <h5>E-mail</h5>
                    <input type='text' value={email} onChange={e => setEmail(e.target.value)} />

                    <h5>Password</h5>
                    <input type='password' value={password} onChange={e => setPassword(e.target.value)} />

                    <h5>Pnone_Number</h5>
                    <input type='text' value={phone} onChange={e => setPhone(e.target.value)} />

                    <h5>Gender</h5>
                    <input type='text' value={gender} onChange={e => setGender(e.target.value)} />

                    <h5>Address</h5>
                    <input type='text' value={address} onChange={e => setAddress(e.target.value)} />

                <button type="submit"  className='login__signInButton'>Submit</button>
                    
                    </form>

               

            </div>
    </div>
  );
}

 