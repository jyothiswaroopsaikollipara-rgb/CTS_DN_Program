import React from "react";
import EventExamples from "./EventExamples";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  return (
    <div style={{ padding: "20px" }}>
      <EventExamples />
      <hr />
      <CurrencyConvertor />
    </div>
  );
}

export default App;