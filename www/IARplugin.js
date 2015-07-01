/*global cordova, module*/

module.exports = {
    launch: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "IARplugin", "launch", [name]);
    }
};
