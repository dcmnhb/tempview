const display = { weekday: 'long', day: 'numeric', month: 'long', year: 'numeric' };
// Get the current date and time
var now = new Date();
var dateTimeString = now.toLocaleString("en-AU", display);
// You can customize the format as needed
// Update the content of the placeholder element
document.getElementById('date').textContent = dateTimeString;

const node = document.querySelector("#searchInput");
node.addEventListener("keyup", function(event) {
    if (event.key === "Enter") {
        const searchInput = node.value;
        window.location.href = "/search.html?searchInput=" + searchInput;
    }
});