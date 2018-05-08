package cn.nieking.usercenter.data.repository

import cn.nieking.baselibrary.data.net.RetrofitFactory
import cn.nieking.baselibrary.data.protocol.BaseResp
import cn.nieking.usercenter.data.api.UserApi
import cn.nieking.usercenter.data.protocol.RegisterReq
import rx.Observable

class UserRepository {

    fun reigster(mobile: String, pwd: String, verifyCode: String): Observable<BaseResp<String>> {
        return RetrofitFactory.instance
                .create(UserApi::class.java)
                .register(RegisterReq(mobile, pwd, verifyCode))
    }
}