/**
 * Copyright: 2016 Haiziwang
 **
 * Author:  Daniel Kong
 * Date:    2016-05-09
 */

'use strict';

var API_HOST = 'http://172.172.178.17';
var API_PORT = '9002';
var API_BASE = '/api';
var ENV = 'test';

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