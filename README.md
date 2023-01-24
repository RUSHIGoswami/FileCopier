# FileCopier

<h1>Approach</h1>

-> The challenge is implemented with Core Java.<br>
-> I have used java in-built file handling character stream classes like File, FileReader, FileWriter etc.<br>
-> My Approach is to take source path , file name and destination path as user input after which initializing file object.<br>
-> After getting file objects it is checking if file exists by using in-built method file.exists(). <br>
-> If file exists and if both input and output objects are same and exist then, first it'll create new file naming it with "-copy" and appending appropriate number.<br>
-> It'll make one object of FileReader to read the source file and FileWriter object to write into new renamed destination file.

<hr>

<h1>Snapshots of Output</h1>

![Copying into same folder](https://user-images.githubusercontent.com/64486280/214250364-8dfd6f86-7812-4d97-bf99-a84980ea6ee3.png)
<br>
![Output](https://user-images.githubusercontent.com/64486280/214250481-fbeb06d9-fddc-4d9d-a24b-0de965db4347.png)
<br>

![Copying to different folder](https://user-images.githubusercontent.com/64486280/214250861-5a78ccb9-c3da-4144-920a-718ba3c664b3.png)
<br>
![Output](https://user-images.githubusercontent.com/64486280/214250885-a0d41ab0-6427-4597-9968-deb42f012250.png)
<br>
