var $ajax = {
    request: function (url, options, callback) {
        $ajax.parseOptions(options);

        $.ajax({
            url: url,
            method: options.method,
            contentType: options.contentType,
            data: options.data,
            dataType: options.dataType
        })
            .done(function (data, textStatus, jqXHR) {
                callback(null, data);
            })
            .fail(function (jqXHR, textStatus, err) {
                callback(err, null);
            });
    },
    parseOptions: function (options) {
        options = options || {};

        var defaultOptions = {
            method: "GET",
            contentType: "application/json; charset=UTF-8",
            data: {},
            dataType: "json",
            stringify: false
        };

        var keys = Object.keys(defaultOptions);

        for (var i = 0; i < keys.length; i++)
            options[keys[i]] = (typeof options[keys[i]] === "undefined") ? defaultOptions[keys[i]] : options[keys[i]];

        if(options.stringify == true)
            options.data = JSON.stringify(options.data);
    }
};