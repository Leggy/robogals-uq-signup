
function test() {
    var validInput = true;

    var firstName = document.getElementById("firstName").value.trim();
    var surname = document.getElementById("surname").value.trim();
    var email = document.getElementById("email").value.trim();
    var studentNumber = document.getElementById("studentNumber").value.trim();
    var degree = document.getElementById("degree").value.trim();
    var year = document.getElementById("year").value.trim();

    if (isEmpty(firstName)) {
        document.getElementById("fnamep").style.display = "block";
        validInput = false;
    } else {
        document.getElementById("fnamep").style.display = "none";
    }

    if (isEmpty(surname)) {
        document.getElementById("surnamep").style.display = "block";
        validInput = false;
    } else {
        document.getElementById("surnamep").style.display = "none";
    }

    if (isEmpty(email)) {
        document.getElementById("emailp").style.display = "block";
        validInput = false;
    } else {
        document.getElementById("emailp").style.display = "none";
    }

    if (isEmpty(studentNumber) || isNaN(studentNumber)) {
        document.getElementById("studentnop").style.display = "block";
        validInput = false;
    } else {
        document.getElementById("studentnop").style.display = "none";
    }

    if (isEmpty(degree)) {
        document.getElementById("degreep").style.display = "block";
        validInput = false;
    } else {
        document.getElementById("degreep").style.display = "none";
    }

    if (isEmpty(year)) {
        document.getElementById("yearp").style.display = "block";
        validInput = false;
    } else {
        document.getElementById("yearp").style.display = "none";
    }
    return validInput;
}

function isEmpty(str) {
    return (!str || 0 === str.length);
}

function clearForms() {
    document.getElementById("firstName").value = "";
    document.getElementById("surname").value = "";
    document.getElementById("email").value = "";
    document.getElementById("studentNumber").value = "";
    document.getElementById("degree").value = "";
    document.getElementById("year").value = "";
    document.getElementById("sex_f").checked = true;
}

function showWelcome() {
    $("#join-form").toggle(250);
    //$("#welcome").toggle(250);

    $("#welcome").show(250);
    setTimeout(function(){
        showForm();
    }, 4000);
}

function showForm() {
    $("#join-form").show(250);
    $("#welcome").hide(250);
}



// onLoad function, runs when the document loads
$(document).ready(function() {
    $("#welcome").css({display:"block"});
    $("#welcome").hide(0);
});
