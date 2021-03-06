/**
 * Copyright: 2016 Haiziwang
 **
 * Author:  Daniel Kong
 * Date:    2016-05-09
 */

'use strict';

var API_HOST = 'http://192.168.24.48';
var API_PORT = '8080';
var API_BASE = '/api';
var ENV = 'demo';

wmsApp.constant('WMS_API_PROVIDER', API_HOST ? (API_HOST + ':' + API_PORT) : '');
wmsApp.constant('WMS_API_END_POINT', API_BASE);
wmsApp.constant('WMS_ENV', ENV);

/**
 * 弹框配置
 */
wmsApp.config(['PopupProvider', function (PopupProvider) {
    PopupProvider.title = '提示';
    PopupProvider.okValue = '确定';
    PopupProvider.cancelValue = '取消';
}]);