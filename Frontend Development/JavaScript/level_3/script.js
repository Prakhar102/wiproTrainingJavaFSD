const apiUrl = "https://jsonplaceholder.typicode.com/users";
const tableBody = document.getElementById("tableBody");



//  FETCH 
async function fetchEmployees() {
  try {
    const res = await fetch(apiUrl);

    if (!res.ok) {
      throw new Error("Failed to fetch");
    }

    const data = await res.json();

    dataInTable(data);

  } catch (err) {
    console.error(err);
  }
}



// SHOW DATA 
function dataInTable(users) {

  tableBody.innerHTML = "";

  users.forEach(user => {

    const row = `
      <tr>
        <td>${user.name}</td>
        <td>${user.email}</td>
        <td>${user.company ? user.company.name : "N/A"}</td>

        <td>
          <button onclick="editEmployee(${user.id})">Edit</button>
          <button onclick="deleteEmployee(${user.id})">Delete</button>
        </td>
      </tr>
    `;

    tableBody.innerHTML += row;
  });
}




//  ADD / UPDATE
async function AddEmployee() {

  const id = document.getElementById("empId").value;
  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;

  const userData = { name, email };

  try {

    if (id) {
      // UPDATE
      await fetch(`${apiUrl}/${id}`, {
        method: "PUT",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(userData)
      });

      alert("Employee updated");

    } 
    
    else {
      // ADD
      await fetch(apiUrl, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(userData)
      });

      alert("Employee added");
    }

    clearForm();
    fetchEmployees();

  } catch (err) {
    console.error(err);
  }
}





// EDIT 
function editEmployee(id) {

  fetch(apiUrl + "/" + id)
    .then(res => res.json())
    .then(user => {

      document.getElementById("empId").value = user.id;
      document.getElementById("name").value = user.name;
      document.getElementById("email").value = user.email;

      document.getElementById("formTitle").innerText = "Update Employee";
    });
}





// DELETE 
async function deleteEmployee(id) {

  try {
    await fetch(`${apiUrl}/${id}`, {
      method: "DELETE"
    });

    alert("Employee deleted");

    fetchEmployees();

  } catch (err) {
    console.error(err);
  }
}

// CLEAR
function clearForm() {
  document.getElementById("empId").value = "";
  document.getElementById("name").value = "";
  document.getElementById("email").value = "";

  document.getElementById("formTitle").innerText = "Add Employee";
}


fetchEmployees();