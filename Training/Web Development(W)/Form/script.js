function saveData() {
    alert("You submitted the form");

    // Retrieving data from the form
    var pId = document.getElementById("projectId").value;
    var pName = document.getElementById("projectName").value;
    var startDate = document.getElementById("startDate").value;
    var endDate = document.getElementById("endDate").value;
    var price = document.getElementById("price").value;
    var location = document.getElementById("location").value;
    var projectDescription = document.querySelector("textarea").value;
    var projectType = document.querySelector('input[name="projectType"]:checked')?.value || "";
    var completionStatus = document.getElementById("completionStatus").value;

    console.log("Project ID: " + pId);
    console.log("Project Name: " + pName);

    // Storing values in localStorage
    localStorage.setItem("projectId", pId);
    localStorage.setItem("projectName", pName);
    localStorage.setItem("startDate", startDate);
    localStorage.setItem("endDate", endDate);
    localStorage.setItem("price", price);
    localStorage.setItem("location", location);
    localStorage.setItem("projectDescription", projectDescription);
    localStorage.setItem("projectType", projectType);
    localStorage.setItem("completionStatus", completionStatus);
}

function getData() {
    // Retrieving values from localStorage
    var storedPId = localStorage.getItem("projectId");
    var storedPName = localStorage.getItem("projectName");

    var enteredPId = document.getElementById("projectId").value;
    var enteredPName = document.getElementById("projectName").value;

    if (enteredPId === storedPId && enteredPName === storedPName) {
        document.getElementById("startDate").value = localStorage.getItem("startDate");
        document.getElementById("endDate").value = localStorage.getItem("endDate");
        document.getElementById("price").value = localStorage.getItem("price");
        document.getElementById("location").value = localStorage.getItem("location");
        document.querySelector("textarea").value = localStorage.getItem("projectDescription");
        document.getElementById("completionStatus").value = localStorage.getItem("completionStatus");
        document.getElementById("statusValue").textContent = localStorage.getItem("completionStatus") + "%";

        var projectType = localStorage.getItem("projectType");
        if (projectType) {
            document.querySelector(`input[name="projectType"][value="${projectType}"]`).checked = true;
        }

        console.log("Matching Project Found!");
        console.log("Project ID: " + storedPId);
        console.log("Project Name: " + storedPName);
        console.log("Start Date: " + localStorage.getItem("startDate"));
        console.log("End Date: " + localStorage.getItem("endDate"));
        console.log("Price: " + localStorage.getItem("price"));
        console.log("Location: " + localStorage.getItem("location"));
        console.log("Project Description: " + localStorage.getItem("projectDescription"));
        console.log("Project Type: " + localStorage.getItem("projectType"));
        console.log("Completion Status: " + localStorage.getItem("completionStatus"));
    } else {
        console.log("❌ Project ID and Name do not match! No data retrieved.");
    }
}
