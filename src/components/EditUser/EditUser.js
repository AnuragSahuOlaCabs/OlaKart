import "./EditUser.css";
import React,{useState} from 'react';
export default function EditUser(props){

    const [name, setName] = useState('');
    const [phone, setPhone] = useState('');
    const [gender, setGender] = useState('');
    const [address, setAddress] = useState('');
    const [photo, setPhoto] = useState('');

    
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
        <div>
            <div className="container d-flex justify-content-center mt-5">

                <div className="card1">
                    <form onSubmit={handleSubmit}>
                        <h5 className="phone-number">Photo URL</h5>
                        <input type='text' className="space" value={photo} onChange={e => setPhoto(e.target.value)} />
                        <h5 className="phone-number">Name</h5>
                        <input type='text' className="space" value={name} onChange={e => setName(e.target.value)} />

                        <h5 className="phone-number">Pnone_Number</h5>
                        <input type='text' className="space" value={phone} onChange={e => setPhone(e.target.value)} />

                        <h5 className="phone-number">Gender</h5>
                        <input type='text' className="space" value={gender} onChange={e => setGender(e.target.value)} />

                        <h5 className="phone-number">Address</h5>
                        <input type='text' className="space" value={address} onChange={e => setAddress(e.target.value)} /><br/>

                        <button type="submit"  className='save'>Save</button>
                    
                    </form>
                </div>

            </div>

        </div>
    );
}