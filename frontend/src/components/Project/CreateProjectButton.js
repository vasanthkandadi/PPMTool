import { Link } from "react-router-dom";

const CreateProjectButton = () => {

    return(

        <div>
            <Link to="/addProject" className="btn btn-lg btn-info">
                            Create a Project
            </Link>
        </div>
    )
}

export default CreateProjectButton;