
import ProjectItem from "./Project/ProjectItem";
import "/node_modules/bootstrap/dist/css/bootstrap.min.css";
const Dashboard = () => {
    return(

        <div>
            <h1 className="alert alert-warning">Welcome to Dashboard</h1>
            <ProjectItem/>
            <ProjectItem/>
            <ProjectItem/>
        </div>
    );
}

export default Dashboard;