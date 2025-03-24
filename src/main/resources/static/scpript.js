function criarConfete() {
    const confete = document.createElement("div");
    confete.classList.add("confete");

    const cores = ["red", "yellow", "blue", "green", "purple", "orange"];
    confete.style.backgroundColor = cores[Math.floor(Math.random() * cores.length)];

    confete.style.left = Math.random() * window.innerWidth + "px";
    confete.style.bottom = "0px";

    let tamanho = Math.random() * 20 + 10;
    confete.style.width = tamanho + "px";
    confete.style.height = tamanho + "px";

    document.body.appendChild(confete);

    setTimeout(() => confete.remove(), 3000);
}
setInterval(() => {
    for (let i = 0; i < 5; i++) {
        criarConfete();
    }
}, 200);
