/**
 * Function to Search the movie
 */
function searchMovie(){
    var movieName = document.getElementById("search-field").value;
    var searchUrl = "http://www.omdbapi.com/?s="+movieName+"&apikey=a6d715f0";
    
    fetch(searchUrl)
    .then(res => res.json())
    .then(json => console.log(json));
}