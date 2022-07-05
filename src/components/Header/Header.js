import {Link} from 'react-router-dom';
import "./Header.css";
import logo from './logo.png';
import cart from './cart.png';
import user from './user.png';

export default function Header(props){
    return(
        <div className='head'>
            <button className='lgobt'><img src={logo} className="logo" alt="logo" /></button>
            <button className='nmbt'><h1>Olakart</h1></button>
            <Link to = '/Cart'><button className='hdbt'><img src={cart} className="cart" alt="cart" /></button></Link>
            <Link to = '/User'><button className='userbt'><img src={user} className="user" alt="user" /></button></Link>

        </div>
    );
}