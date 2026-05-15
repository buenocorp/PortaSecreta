(function () {
    var startMs = window.timerStartMs;
    if (!startMs) return;

    var el = document.getElementById('timer');
    if (!el) return;

    function update() {
        var elapsed = Date.now() - startMs;
        var s = Math.floor(elapsed / 1000);
        var m = Math.floor(s / 60);
        var ss = String(s % 60).padStart(2, '0');
        el.textContent = m + ':' + ss;
    }

    update();
    setInterval(update, 1000);
})();
