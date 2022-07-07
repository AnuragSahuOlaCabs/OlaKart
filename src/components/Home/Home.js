import "./Home.css";
import { Link } from "react-router-dom";
import im1 from './im1.png';
import im2 from './im2.png';
import im3 from './im3.png';
import im4 from './im4.png';
import im5 from './im5.png';
import img1 from './image1.png';
import img2 from './image2.png';

export default function Home(props){
    return(
        <div>
            <div id="carouselExampleIndicators" className="carousel slide" data-bs-ride="carousel">
                <div className="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to={0} className="active" aria-current="true" aria-label="Slide 1" />
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to={1} aria-label="Slide 2" />
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to={2} aria-label="Slide 3" />
                </div>
                <div className="carousel-inner">
                <div className="carousel-item active">
                    <img src="https://images-eu.ssl-images-amazon.com/images/G/31/img2020/img21/apparelGW/U599/jun22/eoss/apay/WA_3000._CB633632198_.jpg" className="d-block w-100" alt="..." />
                </div>  
                <div className="carousel-item">
                    <img src="https://images-eu.ssl-images-amazon.com/images/G/31/img22/WLA/July/GWUnrec/PFS/D39822856_WLA_BAU_GW-Unrec-heroes_DesktopTallHero_3000x1200._CB634361564_.jpg" className="d-block w-100" alt="..." />
                </div>
                <div className="carousel-item">
                    <img src="https://images-eu.ssl-images-amazon.com/images/G/31/img21/MI/Under1499_Tallhero_3000x1200._CB634138928_.jpg" className="d-block w-100" alt="..." />
                </div>
                </div>
                <button className="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                <span className="carousel-control-prev-icon" aria-hidden="true" />
                <span className="visually-hidden">Previous</span>
                </button>
                <button className="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                <span className="carousel-control-next-icon" aria-hidden="true" />
                <span className="visually-hidden">Next</span>
                </button>
            </div>

            <div className ="container-fluid py-2 scroll">
                
                <div className="d-flex flex-row flex-nowrap">
                    <div className="card card-body" style={{width: '18rem'}}>
                            <h5 className="card-title">Card title</h5>
                            <img src={im4} className="card-img-top" alt="..." />
                            <div className="card-body">
                                
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                <a href="#" className="btn btn-primary">Go to Product</a>
                            </div>
                    </div>
                    <div class="card card-body" style={{width: '18rem'}}>
                            <h5 className="card-title">Card title</h5>
                            <img src={im3} className="card-img-top" alt="..." />
                            <div className="card-body">
                                
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                <a href="#" className="btn btn-primary">Go to Product</a>
                            </div>
                    </div>
                    <div class="card card-body" style={{width: '18rem'}}>
                            <h5 className="card-title">Card title</h5>
                            <img src={im2} className="card-img-top" alt="..." />
                            <div className="card-body">
                                
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                <a href="#" className="btn btn-primary">Go to Product</a>
                            </div>
                    </div>
                    <div class="card card-body" style={{width: '18rem'}}>
                            <h5 className="card-title">Card title</h5>
                            <img src={im1} className="card-img-top" alt="..." />
                            <div className="card-body">
                                
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                <a href="#" className="btn btn-primary">Go to Product</a>
                            </div>
                    </div>
                    <div class="card card-body" style={{width: '18rem'}}>
                            <h5 className="card-title">Card title</h5>
                            <img src={im5} className="card-img-top" alt="..." />
                            <div className="card-body">
                                
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                <a href="#" className="btn btn-primary">Go to Product</a>
                            </div>
                    </div>
                    <div class="card card-body" style={{width: '18rem'}}>
                            <h5 className="card-title">Card title</h5>
                            <img src={im2} className="card-img-top" alt="..." />
                            <div className="card-body">
                                
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                <a href="#" className="btn btn-primary">Go to Product</a>
                            </div>
                    </div>
                </div>
            </div>

            <div className="adv1">
                <Link to = '/Adv1'><button className="btn1"><img className="img1" src={img1}/></button></Link>
            </div>
            <div className="adv1">
                <Link to = '/Adv1'><button className="btn1"><img className="img1" src={img2}/></button></Link>
            </div>
        </div>
    )
}