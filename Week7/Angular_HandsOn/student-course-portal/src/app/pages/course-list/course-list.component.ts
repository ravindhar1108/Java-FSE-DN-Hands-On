import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCardComponent } from '../../components/course-card/course-card.component';
import { Course } from '../../models/course.model';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, CourseCardComponent],
  templateUrl: './course-list.component.html',
  styleUrl: './course-list.component.css'
})
export class CourseListComponent implements OnInit {
  courses: Course[] = [
    { id: 1, name: 'Math', code: 'MATH101', credits: 4, gradeStatus: 'passed' },
    { id: 2, name: 'Physics', code: 'PHY101', credits: 3, gradeStatus: 'pending' },
    { id: 3, name: 'Chemistry', code: 'CHEM101', credits: 4, gradeStatus: 'failed' }
  ];
  isLoading = true;
  selectedCourseId: number | null = null;

  ngOnInit() {
    setTimeout(() => {
      this.isLoading = false;
    }, 1500);
  }

  onEnroll(courseId: number) {
    console.log('Enrolling in course:', courseId);
    this.selectedCourseId = courseId;
  }

  trackByCourseId(index: number, course: Course) {
    return course.id;
  }
}
