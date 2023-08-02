const shareStory = document.getElementById('btn');
const image = document.getElementById("img");
const titleheading = document.getElementById("heading");
const paragraph = document.getElementById("para");
const author = document.getElementById("btn-author");
const container = document.getElementsByClassName("container")[0];

// form input box
let title = document.getElementById('title');
let image_url = document.getElementById('img-url');
let authorName = document.getElementById('author-name');
let story = document.getElementById('story');

function updatePreview(event) {
    event.preventDefault();

    container.style.display = "flex";

    titleheading.textContent = title.value;

    image.src = image_url.value;
    author.textContent = authorName.value;
    paragraph.textContent = story.value;
}

shareStory.addEventListener('click', updatePreview);