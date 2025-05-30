 //fetch('/board/578/replies')
  //.then((response) => response.json())
   // .then((json) => console.log(json));

function register(data) {
  fetch('/board/578/replies', {
    method: 'POST',
    body: JSON.stringify(data),
    headers: {
      'Content-type' : 'application/json; charset=UTF-8',
    },
  })
    .then((response) => response.text())
    .then((json) => console.log(json));
}
