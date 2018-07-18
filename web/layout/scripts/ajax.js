$(document).ready(function () {
    $("states").change(function () {
        if ($("#states").val() === "Durango") {
            $.getJSON("layout/json/coahuila.json", function (data) {
                $.each(data, function (index, value) {
                    $("#cities").append("<option>" + value + "</option>");
                });
            });
        } if ($("#states").val() === "Coahuila") {
            $.getJSON("layout/json/durango.json", function (data) {
                $.each(data, function (index, value) {
                    $("#cities").append("<option>" + value + "</option>");
                });
            })
        }
    });
});