<div class="fieldcontain">
    <label for="firstName">First Name</label>
    <g:textField name="firstName" value="${firstName}" />
</div>

<div class="fieldcontain">
    <label for="comments">Comments</label>
    <g:textArea name="comments" value="${comments}" />
</div>

<div class="fieldcontain">
    <label for="password">Password</label>
    <g:passwordField name="password" value="${password}" />
</div>

<div class="fieldcontain">
    <label for="notify">Do you want e-mail notifications</label>
    <g:checkBox name="notify" value="${notify}" />
</div>

<div class="fieldcontain">
    <label for="gender">Gender: </label>
    <g:radioGroup name="gender" labels="['Male', 'Female']" values="['M', 'F']"value="${gender}" >
        ${it.label} ${it.radio}
    </g:radioGroup>
</div>

<div class="fieldcontain">
    <label for="marketing">How did you hear about us?</label>
    <g:select from="['Internet', 'Friend', 'Other']" name="marketing" value="${marketing}" />
</div>
