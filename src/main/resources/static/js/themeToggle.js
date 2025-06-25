document.addEventListener("DOMContentLoaded", function () {
  const switcher = document.getElementById("themeSwitch");
  const themeLink = document.getElementById("themeStylesheet");

  const storedTheme = localStorage.getItem("theme");
  if (storedTheme === "dark") {
    themeLink.href = "/css/styleDark.css";
    switcher.checked = true;
  }

  switcher.addEventListener("change", () => {
    if (switcher.checked) {
      themeLink.href = "/css/styleDark.css";
      localStorage.setItem("theme", "dark");
    } else {
      themeLink.href = "/css/styleLight.css";
      localStorage.setItem("theme", "light");
    }
  });
});
