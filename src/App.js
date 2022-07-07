import './App.css';
import { BrowserRouter as Router , Routes , Route} from 'react-router-dom';
import Home from './components/Home/Home';
import Navbar from './components/Navbar/Navbar';
import Header from './components/Header/Header';
import SignUp from './components/SignUp/SignUp'
import Login from './components/Login/Login';
import Mobile from './components/Mobile/Mobile';
import Fashion from './components/Fashion/Fashion';
import Kitchen from './components/Kitchen/Kitchen';
import User from './components/User/User';
import EditUser from './components/EditUser/EditUser';


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
            <Route exact path = '/SignUp' element = {<SignUp/>}/>
            <Route exact path = '/Login' element = {<Login/>}/>
            <Route exact path = '/Mobile' element = {<Mobile/>}/>
            <Route exact path = '/Fashion' element = {<Fashion/>}/>
            <Route exact path = '/Kitchen' element = {<Kitchen/>}/>
            <Route exact path = '/User' element = {<User/>}/>
            <Route exact path = '/EditUser' element = {<EditUser/>}/>
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
