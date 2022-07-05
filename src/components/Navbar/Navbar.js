import {Link} from 'react-router-dom';
import "./Navbar.css";

export default function Navbar(props){
    return(
        <div>
            <Link to = '/Home'><button className='bt'>Home</button></Link>
            <Link to = '/Fashion'><button className='bt'>Fashion</button></Link>
            <Link to = '/Mobile'><button className='bt'>Mobile</button></Link>
            <Link to = '/Kitchen'><button className='bt'>Kitchen</button></Link>
            <Link to = '/Electronics'><button className='bt'>Electronics</button></Link>
            <Link to = '/Books'><button className='bt'>Books</button></Link>
            <Link to = '/Sports'><button className='bt'>Sports</button></Link>
            <Link to = '/HomeDecor'><button className='bt'>HomeDecor</button></Link>
            <Link to = '/Beauty'><button className='bt'>Beauty</button></Link>
            <Link to = '/Essentials'><button className='bt'>Essentials</button></Link>

        </div>
    );
}