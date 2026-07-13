const CalculateScore = ({ Name, School, Total, Goal }) => {
  const average = Total / Goal;

  return (
    <div>
      <h1>Student Details:</h1>
      <p>Name: {Name}</p>
      <p>School: {School}</p>
      <p>Total: {Total}</p>
      <p>Goal: {Goal}</p>
      <p>Average Score: {average}</p>
    </div>
  );
};

export default CalculateScore;