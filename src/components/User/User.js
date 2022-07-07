import "./User.css";
import {Link} from 'react-router-dom';
export default function User(props){
    return (
        <div>
            <div className="container d-flex justify-content-center mt-5">

                <div className="card1">
                    
                    <div className="top-container">
                        
                        <img src="https://i.imgur.com/G1pXs7D.jpg" class="img-fluid profile-image" width="70"/>
                        
                        <div className="ml-3">
                            <h5 className="name">Clarke Jeffery</h5>
                            <p className="mail">clark@zmail.com</p>
                        </div>
                        <Link to = '/EditUser'><button className='editbtn'>Edit</button></Link>
                    </div>


                    <button className="middle-container d-flex justify-content-between align-items-center mt-3 p-2">
                            <div className="dollar-div px-3">
                                
                                <div className="round-div"><i class="fa fa-dollar dollar"></i></div>

                            </div>
                            <div className="d-flex flex-column text-right mr-2">
                                <span className="current-balance">Current Balance</span>
                                <span className="amount"><span class="dollar-sign">$</span>1476</span>
                            </div>

                    </button>

                    <div className="recent-border mt-4">
                        <h5 className="phone-number">Phone Number</h5>
                    </div>
                    <div className="wishlist-border pt-2">
                        <h6>9678364826</h6>
                    </div>
                    <div className="fashion-studio-border pt-2">
                        <h5 className="adress">Address</h5>
                    </div>

                    <div className="fashion-studio-border pt-2">
                        <h6> BTM layout , Koramangala , Hosur road , PIN 560095</h6>
                    </div>
                    <div className="wishlist-border pt-2">
                        <h5 className="gender">Gender</h5>
                    </div>

                    <div className="wishlist-border pt-2">
                        <h6>Male</h6>
                    </div>

                    
                    
                </div>

            </div>

        </div>
    );
}