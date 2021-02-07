# 3160-Group-Project-Fall-2020
Members: Christian Kotas, Adam Hill, Austin Hill, Andrew Darkwah, Patrick Carney

Introduction:
For this project we take an existing database for a food delivery service and implement a rating system. 
This rating system will be implemented for both the restaurant and the delivery driver. They will get a score out of 10. 
There can also be many ratings for both the driver and the restaurant. When viewing a restaurant, you can see the min, max,
and average ratings. Drivers will also have a view min, max, and average ratings.

# Video About Project
https://youtu.be/SOgHAlkY0tg

# Use Case
![Use Case](https://github.com/ckotas/3160-Group-Project-Fall-2020/blob/main/Rating_System_Group_8.png)

# Business rules
The goal of this project is to implement a rating system for customers to rate the restaurant and driver.

Customers will be able to give a rating from 0-10 for the restaurant and driver.

Customer will be able to see the average rating for the restaurant and driver.

Customer will be able to see the maximum rating for the restaurant and driver.

Customer will be able to see the minimum rating for the restaurant and driver.

Administrators can see all reviews.

Administrators can remove any review.

# EERD 
![Use Case](https://github.com/ckotas/3160-Group-Project-Fall-2020/blob/main/UPDATED_EER.png)

# Data Dictionary

<a href="https://github.com/ckotas/3160-Group-Project-Fall-2020/blob/main/Data_Dictionary2.pdf">Data Dictionary</a>

# Test Data

![Use Case](https://github.com/ckotas/3160-Group-Project-Fall-2020/blob/main/table_select/ratingsystem_table.png)

Check <a href="https://github.com/ckotas/3160-Group-Project-Fall-2020/tree/main/table_select">table_select</a> for the rest of the pictures

# SQL Dump File
<a href="https://github.com/ckotas/3160-Group-Project-Fall-2020/blob/main/Dump20201214.sql">SQL Dump File</a>

# Advanced SQL statements
<a href="https://github.com/ckotas/3160-Group-Project-Fall-2020/tree/main/Advance%20SQL">Advanced SQL pictures</a>

# Powerpoint
<a href="https://github.com/ckotas/3160-Group-Project-Fall-2020/blob/main/ITSC_3160_Group_8.pptx"> Powerpoint</a>

# Indexs
Indexes can help to speed up the query processing. Most indexes are on the primary keys or a unique key that has a unique constraint.
In our case most of the time when we sorted we based it on the data that was created in the stored procedure and not the columns.
We did not use indexes for the sort because the data was a temporary variable that would be gone when the procedure was done. You also want to be careful because adding indexes can be costly and slow down your database.
