function Calc()
{
    let empName = prompt("Enter Employee Name : ");
    let b_salary = Number(prompt("ENter Basic Salary : "));
    let WorkingDays = Number(prompt("Enter Working Days : "));
    let bonus = Number(prompt("Enter Bonus : "));

    let totalDays = 30;
    let grossSalary, tax, netSalary;


    function CalculateGrossSalary()
    {
        let perDaySalary = b_salary / totalDays;
        let earnedSalary = perDaySalary * WorkingDays;
        grossSalary = earnedSalary + bonus;
    }

    function CalculateTax()
    {
        if(grossSalary <= 25000)
        {
            tax = grossSalary * 0.05;
        }
        else {
            tax = grossSalary * 0.1;
        }
    }

    function CalculateNetSalary()
    {
        netSalary = grossSalary - tax;
    }

    CalculateGrossSalary();
    CalculateTax();
    CalculateNetSalary();

document.writeln("<b>Name:</b> " + empName + "<br>");
document.writeln("<b>Gross Salary:</b> ₹" + grossSalary + "<br>");
document.writeln("<b>Tax:</b> ₹" + tax + "<br>");
document.writeln("<b>Net Salary:</b> ₹" + netSalary + "<br>");
}