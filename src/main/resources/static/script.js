document.addEventListener('DOMContentLoaded', () => {
    const roleButtons = document.querySelectorAll('.role-btn');
    const hero = document.getElementById('hero');
    const neonPlayground = document.getElementById('neon-playground');
    const neonObject = document.querySelector('.neon-object');

    roleButtons.forEach(button => {
        button.addEventListener('click', () => {
            const role = button.getAttribute('data-role');
            selectRole(role);
        });
    });

    function selectRole(role) {
        hero.classList.remove('user-role', 'admin-role', 'guest-role');
        hero.classList.add(`${role}-role`);

        const heroTitle = hero.querySelector('h1');
        const heroText = hero.querySelector('p');

        switch (role) {
            case 'user':
                heroTitle.textContent = 'Welcome, Dreamer!';
                heroText.textContent = 'Explore the neon realms of your imagination.';
                break;
            case 'admin':
                heroTitle.textContent = 'Master of Dreams';
                heroText.textContent = 'Shape the neon world with your cosmic powers.';
                break;
            case 'guest':
                heroTitle.textContent = 'Greetings, Traveler!';
                heroText.textContent = 'Witness the wonders of our neon universe.';
                break;
        }

        hero.style.animation = 'none';
        hero.offsetHeight;
        hero.style.animation = 'fadeIn 0.5s ease-in-out';
    }

    // Interactive neon object
    neonPlayground.addEventListener('mousemove', (e) => {
        const rect = neonPlayground.getBoundingClientRect();
        const x = e.clientX - rect.left;
        const y = e.clientY - rect.top;

        neonObject.style.transform = `translate(${x - 25}px, ${y - 25}px)`;
    });

    neonPlayground.addEventListener('click', () => {
        createNeonSpark(event);
    });

    function createNeonSpark(event) {
        const spark = document.createElement('div');
        spark.classList.add('neon-spark');
        const rect = neonPlayground.getBoundingClientRect();
        const x = event.clientX - rect.left;
        const y = event.clientY - rect.top;
        spark.style.left = `${x}px`;
        spark.style.top = `${y}px`;
        neonPlayground.appendChild(spark);

        setTimeout(() => {
            spark.remove();
        }, 1000);
    }

    // Parallax effect for cards
    const cards = document.querySelectorAll('.card');
    document.addEventListener('mousemove', (e) => {
        const x = e.clientX / window.innerWidth;
        const y = e.clientY / window.innerHeight;

        cards.forEach(card => {
            const cardX = (card.offsetLeft + card.offsetWidth / 2) / window.innerWidth;
            const cardY = (card.offsetTop + card.offsetHeight / 2) / window.innerHeight;

            const diffX = cardX - x;
            const diffY = cardY - y;

            card.style.transform = `translate(${diffX * 30}px, ${diffY * 30}px) scale(1.1)`;
        });
    });
});

