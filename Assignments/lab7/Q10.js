let employee = (function () {
   var name;
   var age;
   var salary;
   function getAge() {

      return age;
   }
   function getSalary() {

      return salary;
   }
   function getName() {
      return name;
   }
   function setAge1(newAge) {
      age = newAge
   }
   function setName1(newName) { name = newName }
   function setsalary1(newSalary) { salary = newSalary }

   function inccreaseSalary1(percentage) { salary = getSalary() * (1 + percentage / 100) }
   function incrementAge1() { getAge + 1 }


   return {

      setAge: setAge1,
      setName: setName1,
      setSalary: setsalary1,
      increaseSalary: inccreaseSalary1,
      incrementAge: incrementAge1,
      getEmpInfo: function () {
         return `\nName: ${getName()}\nAge: ${getAge()}\nSalary: ${getSalary()}\n`;
      }
   };


}
)();
employee.setName('Fasil habtegiorgis');
employee.setAge(26);
employee.setSalary(120000.00);
console.log(`Employee Information is: ${employee.getEmpInfo()}`);
employee.incrementAge();
employee.increaseSalary(40);
console.log(`Updated Employee Information is: ${employee.getEmpInfo()}`);
