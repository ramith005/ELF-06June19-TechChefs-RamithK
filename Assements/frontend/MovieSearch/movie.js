/**
 * Function to Search the movie
 */
function searchMovie(){
    var movieName = document.getElementById("search-field").value;
    var searchUrl = "http://www.omdbapi.com/?s="+movieName+"&apikey=a6d715f0";
    fetch(searchUrl)
    .then(response => response.json())
    .then(data => {
        console.log(data) // Prints result from `response.json()` in getRequest
    })
    .catch(error => console.error(error))
    alert("Get tghe movie and search the movies"+movieName);
}
