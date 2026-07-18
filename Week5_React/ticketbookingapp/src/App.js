import React, { Component } from "react";

function GuestPage() {
  return (
    <div>
      <h2>Please Sign Up.</h2>
      <h3>Flight Details</h3>

      <ul>
        <li>Flight: AI-202</li>
        <li>From: Hyderabad</li>
        <li>To: Delhi</li>
        <li>Time: 10:00 AM</li>
      </ul>
    </div>
  );
}

function UserPage() {
  return (
    <div>
      <h2>Welcome Back</h2>
      <h3>You can now book your tickets.</h3>
    </div>
  );
}

class App extends Component {

  constructor(props) {
    super(props);

    this.state = {
      isLoggedIn: false
    };
  }

  login = () => {
    this.setState({
      isLoggedIn: true
    });
  };

  logout = () => {
    this.setState({
      isLoggedIn: false
    });
  };

  render() {
    return (
      <div style={{ padding: "20px" }}>
        <h1>Ticket Booking App</h1>

        {this.state.isLoggedIn ? (
          <div>
            <button onClick={this.logout}>Logout</button>
            <UserPage />
          </div>
        ) : (
          <div>
            <button onClick={this.login}>Login</button>
            <GuestPage />
          </div>
        )}
      </div>
    );
  }
}

export default App;