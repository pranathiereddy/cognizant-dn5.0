import './App.css';
import CohortDetails from './Components/CohortDetails';

function App() {

  const cohorts = [

    {
      cohortCode: "INTADMDF10 - .NET FSD",
      startedOn: "22-Feb-2022",
      currentStatus: "Scheduled",
      coach: "Aathma",
      trainer: "Jojo Jose"
    },

    {
      cohortCode: "ADM21JF014 - Java FSD",
      startedOn: "10-Sep-2021",
      currentStatus: "Ongoing",
      coach: "Apoorv",
      trainer: "Elisa Smith"
    },

    {
      cohortCode: "CDBJF21025 - Java FSD",
      startedOn: "24-Dec-2021",
      currentStatus: "Ongoing",
      coach: "Aathma",
      trainer: "John Doe"
    }

  ];

  return (

    <div>

      <h1>Cohorts Details</h1>

      {
        cohorts.map((cohort, index) => (
          <CohortDetails
            key={index}
            cohort={cohort}
          />
        ))
      }

    </div>

  );

}

export default App;