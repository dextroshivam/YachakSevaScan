// <script>
//     // Function to handle role selection
//     function selectRole(role) {
//     let baseUrl = window.location.origin;
//     let registrationUrl;
//
//     switch (role) {
//     case 'donor':
//     registrationUrl = baseUrl + '/register/donor';
//     break;
//     case 'yachak':
//     registrationUrl = baseUrl + '/register/yachak';
//     break;
//     case 'admin':
//     registrationUrl = baseUrl + '/register/admin';
//     break;
//     case 'superadmin':
//     registrationUrl = baseUrl + '/register/superadmin';
//     break;
//     default:
//     registrationUrl = baseUrl;
// }
//
//     window.location.href = registrationUrl;
// }
//
//     // Add event listeners to role cards
//     document.querySelectorAll('.role-card').forEach(function(card) {
//     card.addEventListener('click', function() {
//         const role = this.getAttribute('onclick').split("'")[1];
//         selectRole(role);
//     });
// });
//
//     // Example: Function to show a message in the interactive section
//     function showMessage(message) {
//     const interactiveSection = document.querySelector('.interactive-section p');
//     interactiveSection.textContent = message;
// }
//
//     // Example: Function to update footer date dynamically
//     function updateFooterDate() {
//     const footerDate = document.querySelector('.footer p');
//     const currentYear = new Date().getFullYear();
//     footerDate.textContent = `© ${currentYear} Yachak Seva Scan. All rights reserved.`;
// }
//
//     // Call the footer date update function on page load
//     window.onload = function() {
//     updateFooterDate();
// };
// </script>
