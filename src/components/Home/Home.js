import "./Home.css";
import { Link } from "react-router-dom";
import im1 from './im1.png';

export default function Home(props){
    return(
        <div>
            <div className="card" style={{width: '18rem'}}>
            <h5 className="card-title">Card title</h5>
                <img src={im1} className="card-img-top" alt="..." />
                <div className="card-body">
                    
                    <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" className="btn btn-primary">Go somewhere</a>
                </div>
            </div>

        </div>
    )
}