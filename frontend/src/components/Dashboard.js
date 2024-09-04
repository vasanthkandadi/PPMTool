
import ProjectItem from "./Project/ProjectItem";
import "/node_modules/bootstrap/dist/css/bootstrap.min.css";
const Dashboard = () => {
    return(
        <div className="projects">
            <div className="container">
                <div className="row">
                    <div className="col-md-12">
                        <h1 className="display-4 text-center">Projects</h1>
                        <br />
                        <a href="www.google.com" className="btn btn-lg btn-info">
                            Create a Project
                        </a>
                        <br />
                        <hr />
                        <ProjectItem/>
                        <ProjectItem/>
                        <ProjectItem/>
    
                        
                    </div>
            </div>
        </div>
    </div>

    );
}

export default Dashboard;