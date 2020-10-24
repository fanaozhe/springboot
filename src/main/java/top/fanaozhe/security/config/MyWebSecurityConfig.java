/*
package top.fanaozhe.security.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

*/
/**
 * @author faz
 * @create 2020-10-24-11:40
 *//*

@Configuration
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    PasswordEncoder PasswordEncoder(){
        //密码不加密
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected  void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("admin").password("123").roles("ADMIN","USER")
                .and()
                .withUser("sang").password("123").roles("USER");
    }

    @Override
    protected void  configure(HttpSecurity http) throws Exception{
        http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/user/**").access("hasAnyRole('ADMIN','USER')")
                //其他用户访问必须经过认证；
                .anyRequest()
                .authenticated()
                //登录页面
                .and()
                .formLogin()
                .loginProcessingUrl("/login")
                .permitAll()

                .and()
                .csrf()
                .disable();
    }



}
*/
