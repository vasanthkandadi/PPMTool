import { useState } from "react";


const AddProject = () => {
    const [project, setProject] = useState({
        projectName : "",
        projectIdentifier : "",
        description : "",
        start_date : "",
        end_date : ""
    })

    const onChange = (e) => {
        setProject({
            ...project,
            [e.target.name] : e.target.value,
        });
    };

    const onSubmit = (e) => {
        e.preventDefault();
        const projectInput = {
            projectName : project.projectName,
            projectIdentifier : project.projectIdentifier,
            description : project.description,
            start_date : project.start_date,
            end_date : project.end_date
        }
        console.log(projectInput);
    }

    return(

        <div className="register">
        <div className="container">
            <div className="row">
                <div className="col-md-8 m-auto">
                    <h5 className="display-4 text-center">Create Project Form</h5>
                    <hr />
                    <form onSubmit={onSubmit}>
                        <div className="form-group my-2">
                            <input type="text" className="form-control form-control-lg "
                             placeholder="Project Name" name="projectName"
                             value = {project.projectName} onChange={onChange}/>
                        </div>
                        <div className="form-group my-2">
                            <input type="text" className="form-control form-control-lg" placeholder="Unique Project ID"
                             name="projectIdentifier" onChange={onChange} value = {project.projectIdentifier}
                             />
                        </div>
                        <div className="form-group my-2">
                            <textarea className="form-control form-control-lg" placeholder="Project Description"
                             name="description" onChange={onChange} value = {project.description}></textarea>
                        </div>
                        <h6>Start Date</h6>
                        <div className="form-group my-2">
                            <input type="date" className="form-control form-control-lg"
                             name="start_date" onChange={onChange} value = {project.start_date}/>
                        </div>
                        <h6>Estimated End Date</h6>
                        <div className="form-group my-2">
                            <input type="date" className="form-control form-control-lg"
                             name="end_date" onChange={onChange} value = {project.end_date}/>
                        </div>

                        <input type="submit" className="btn btn-primary btn-block mt-4" />
                    </form>
                </div>
            </div>
        </div>
    </div>
    )
}

export default AddProject;