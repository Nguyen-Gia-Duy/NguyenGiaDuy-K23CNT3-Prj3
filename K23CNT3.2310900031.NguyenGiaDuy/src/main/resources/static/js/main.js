document.addEventListener("DOMContentLoaded", function () {
    const buttons = document.querySelectorAll(".button");
    buttons.forEach(btn => {
        btn.addEventListener("click", () => {
            alert("Bạn vừa nhấn nút!");
        });
    });
});
