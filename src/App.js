import './App.css';
import { BrowserRouter as Router , Routes , Route} from 'react-router-dom';
import Home from './components/Home/Home';
import Navbar from './components/Navbar/Navbar';
import Header from './components/Header/Header';


function App() {

  

  return (
    <div>
      <Router>
        <div>
          <Header/>
          <Navbar/>
          <Routes>
            
            {/* <Route exact path = '/Login' element = {<Login isLoggedIn = {isLoggedIn} setIsLoggedIn = {setIsLoggedIn}/>}/> */}
            <Route exact path = '/Home' element = {<Home/>}/>
            {/* <Route exact path = '/Faculty' element = {<ProtectedRoute isLoggedIn = {isLoggedIn}><Faculty/></ProtectedRoute>}/>
            <Route exact path = '/Courses' element = {<ProtectedRoute isLoggedIn = {isLoggedIn}><Courses/></ProtectedRoute>}/>
            <Route exact path = '/AboutUs' element = {<ProtectedRoute isLoggedIn = {isLoggedIn}><AboutUs/></ProtectedRoute>}/>
            <Route exact path = '/Contact' element = {<ProtectedRoute isLoggedIn = {isLoggedIn}><Contact/></ProtectedRoute>}/>
            <Route exact path = '/Adv1' element = {<ProtectedRoute isLoggedIn = {isLoggedIn}><Adv1/></ProtectedRoute>}/> */}

          </Routes>
        </div>
      </Router>
    </div>
  );
}

export default App;
